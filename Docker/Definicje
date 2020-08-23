Docker to oprogramowanie open-source pozwalajace na automatyzacje procesu wdrozenia aplikacji. Koncepcja podobna do maszyn wirtualnych, ale duzo lzjesza. 
Kontener Docker’a to opakowanie pozwalajace na uruchamianie pojedynczych procesow. Uruchamiane  sa  w  jadrze systemu operacyjnego hosta co objawia sie 
minimalizacja dodatkowych narzutow na czas wykonania, ale tez zmniejszeniem bezpieczenstwa uruchamianego kodu. Dzieki wykorzystaniu minimalnej przestrzeni dyskowej 
ich czas uruchamiania jest ekstremalnie szybki co powoduje, ze moga sluzyc do wykonywania krotkich zadan bedac wielokrotnie tworzone i usuwane (idea  mikro-serwisów).
Komunikuja sie ze soba i z otoczeniem podobnie jak komputery w sieci lokalnej. Kazdy z nich posiada unikalny adres IP przypisany do wirtualnego interfejsu. 
Kontenery najlepiej sprawdzaja sie w przypadku aplikacji bezstanowych, pozwalajac na latwe skalowanie horyzontalne. W przeciwnym razie stan aplikacji powinien 
byc przechowywany na zewnatrz kontenera np. w bazie danych albo w systemie plikow – co jest niezalecane poniewaz wprowadza dodatkowe zaleznosci. 
Bezstanowosc kontenerow bierze sie z faktu, ze podczas kazdego uruchamiania jest on odtwarzany z obrazu.


obraz (ang. image) – z niego tworzony kontener, jak klasa tworzonych instancji kontenerow

warstwa obrazu (ang. image layer) – warstwy powstaja w wyniku wykonywania czynnosci takich jak: instalacja pakietu, kopiowanie danych, 
                                    ustawienie zmiennej srodowiskowej; sa dostepne jedynie do odczytu i to z nich skladaja sie obrazy
                        
kontener (ang. container) – jest to uruchomiona instancja obrazu Dokera; Zawiera aplikacje wraz z wszystkimi jej zaleznosciami, pozwalając na uruchomienie 
                            jej jako izolowany proces w przestrzeni uzytkownika w systemie operacyjnym  hosta; moze  znajdowac  sie  w  jednym  z  nastepujacych  
                            stanow: created, restarting, running, removing, paused, exitedidead
                      
demon/serwerdockera (ang. docker  daemon/server) – usluga dzialająca w tle na hoscie; zarzadza budowa, dzialaniem i dystrybucja kontenerow Dockera

klient  dockera (ang. docker  client) – narzedzie typu wiersz  poleceń (ang. command-line  tool); pozwala uzytkownikowi na interakcje z demonem/serweremDockera

Docker Hub – publiczny rejestr obrazow Dockera, zawiera duza liczbe gotowych do uzycia obrazow

