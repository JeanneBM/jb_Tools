Konsola https://groovyconsole.appspot.com/

println „Hello World”

Komenty
// jakiś tekst
/* wiele linii
*/

def zmienna = „dane”
zmienna =„nowe dane”

println zmienna
Odwołanie do zmiennej w GROOVY nie wymaga znaku $!

def lista = [ „el1”, „el2”, zm1 ]

def mapa = [ „el1”:1, „el2”:2” ]

def funkcja() {}
def funkcja(argument=wartosc) {}

def hello()
{ println „Hello World” }
hello()

def hello(arg, arg2, arg3=„zombie”)
{
println arg
println arg2
println arg3
}
hello(„Hello World”, „Panda”)

if(warunek)
{ciało instrukcji}

def text = „Panda jest najlepsza!”
if(text.contains(„Panda”))
{
println „To Panda jest najlepsza!”
}

if (warunek)
{ ciało instrukcji }
else
{ ciało instrukcji }

if (warunek)
{ciało instrukcji}
elif
{ciało instrukcji}
else
{ciało instrukcji}

if (warunek1 && warunek2)
{ciało instrukcji}
if(warunek1 || warunek2)
{ciało instrukcji}

while (warunek) {
Zestaw instrukcji
inkrementacja
}

Iteracja po kolekcji:
def lista = [ „el1”, „el2”, „el3” ]
lista.each { element -> println element }

Iteracja po mapie:
def mapa = [ „el1”:1, „el2”:2, „el3”:3 ]
mapa.each { klucz, wartosc -> println
wartosc.join(’, ’) }


============================================================================

println "Hello World"

def zmienna = 2
zmienna = 3

println zmienna

def mapa = [12:1, 11:2]

println mapa[0,1]

def hello()
{ println "Hello World" }
hello()

def hello(arg,arg2,arg3="Zombie")
{
println arg
println arg2
println arg3
}
hello("Hello World","Panda")
hello("Kot","Pies","Mysz")

def text = "Panda jest najlepsza!"
if(text.contains("Panda"))
{
println "To Panda jest najlepsza!"
}

def ulubioneZwierzaki =["kot","pies","krolik"]
if (ulubioneZwierzaki.contains("Panda"))
{
println "My tez was lubimy! :)"
}
else
{
println "Smutełek, nie lubicie Pand! :("
}

ulubioneZwierzaki=["Panda"]
if (ulubioneZwierzaki.contains("Panda"))
{
println "My tez was lubimy! :)"
}
else
{
println "Smutełek, nie lubicie Pand! :("
}

============================================================================

def kot=2
kot=3
println kot


def funkcja (zmienna1, zmienna2)
{
print zmienna1
println zmienna2
}
funkcja("kot_", "pies")
funkcja("mysz_", "chomik")


def mapa = [1:"12", 2:"11"]
println mapa

/*
if(mapa.contains("12"))
{
println "Tam jest 12."
}
*/

def lista =["kot", "mysz", "pies"]
println lista

if(lista.contains("kot"))
{
println "Ala naprawde ma kota"
}

def text = "Ala ma kota!"
if(text.contains("kot"))
{
println "Ala naprawde ma kota"
}


def lista2 = ["kot", "mysz", "pies"]
lista.each {element-> println element}

/*
def mapa2 = [1:"kangur", 2:"tygrys", 3:"zombie"]
mapa.each {klucz,wartosc -> println wartosc.join(",")}
*/

/*
def lista3 = ["kot", "mysz", "pies"]
while (true)
{println element}
*/
