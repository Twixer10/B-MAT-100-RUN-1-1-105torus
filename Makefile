##
## EPITECH PROJECT, 2020
## makefile exe
## File description:
## fct
##

SRCJAVA = src/fr/twixer/torus/Main.java \
		  src/fr/twixer/torus/Utils/Bissection.java \
		  src/fr/twixer/torus/Utils/Newton.java \
		  src/fr/twixer/torus/Utils/Secante.java \

SRCCLASS = fr/twixer/torus/Main.class \
		  fr/twixer/torus/Utils/Bissection.class \
		  fr/twixer/torus/Utils/Newton.class \
		  fr/twixer/torus/Utils/Secante.class \

SRC = 105torus.jar

EXE = 105torus.sh

NAME = 105torus

all:
	mkdir class/
	javac -d ./class $(SRCJAVA)
	cp -r manifest.mf class/
	cd class/ && jar cmf manifest.mf $(SRC) $(SRCCLASS)
	cp -r class/$(SRC) ./
	cp $(EXE) $(NAME)
	chmod 755 $(NAME)

clean:
	rm -rf class/
	rm -f $(SRC)

fclean: clean
	rm -f $(NAME)

re:	fclean all
