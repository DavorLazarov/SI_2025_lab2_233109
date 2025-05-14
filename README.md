# SI_2025_lab2_233109
Davor Lazarov 233109
  
Ciklomatskata kompleksnost na kodot e 7 bidejki brojot na if uslovi e 6 + 1 sto se dodava.
  
---Every Statement:  
1. checkCart(null, "2314567891092921")  
kraen rezultat: "allItems list can't be null!" - prazna niza od elementi ili istata e netocno deklarirana
  
2. List<Item> newList = new ArrayList<>();  
newList.add(new Item("1", 1, 100, 0));  
newList.add(new Item("2", 1, 200, 0));  
newList.add(new Item("", 1, 300, 0));  
checkCart(newList, "2314567891092921") - imeto ne smee da bide prazen string  
kraen rezultat: "Invalid item!"  
  
3. List<Item> newList = new ArrayList<>();  
newList.add(new Item("1", 1, 100, 0));  
newList.add(new Item("2", 1, 200, 0));  
newList.add(new Item("3", 1, 300, 0));  
checkCart(newList, "2314567891092921") - ova e tocen Output  
kraen rezultat: "600.0"  

4. List<Item> newList = new ArrayList<>();  
newList.add(new Item("1", 1, 100, 0));  
newList.add(new Item("2", 1, 200, 0));  
newList.add(new Item("3", 1, 300, 0));  
checkCart(newList, "231456789AEFG321")  
kraen rezultat: "Invalid character in card number!" - brojot na kartickata moze da sodrzhi samo brojki  
  
5. List<Item> newList = new ArrayList<>();  
newList.add(new Item("1", 1, 100, 0));  
newList.add(new Item("2", 1, 200, 0));  
newList.add(new Item("3", 1, 300, 0));  
checkCart(newList, "231456789")  
kraen rezultat: "Invalid card number!" - card number stringot mora da se sostoi od 16 karakteri  
  
---Multiple Condition za uslovot if(item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10):  
Item("Item", 5, 100, 0);  
1.ime 2.kolicestvo 3.cena 4.popust  
  
1. List<Item> newList = new ArrayList<>();  
lista.add(new Item("Item", 5, 100, 0));  
000 - ne e ispolnet nitu eden kriterium tuka  
  
2. List<Item> newList= new ArrayList<>();  
newList.add(new Item("Item", 5, 355, 0));  
100 - samo kriteriumot za cena e ispolnet  
  
3. List<Item> newList = new ArrayList<>();  
newList.add(new Item("Item", 7, 100, 10));  
010 - ispolnet e samo kriterium za popust  
  
4. List<Item> newList = new ArrayList<>();  
newList.add(new Item("Item", 15, 100, 0));  
001 - kriterium za kolicina e ispolnet  
  
5. List<Item> newList = new ArrayList<>();  
newList.add(new Item("Item", 5, 400, 10));  
110 - ne go ispolnuva kriteriumot za kolicina  
  
6. List<Item> newList = new ArrayList<>();  
newList.add(new Item("Item", 13, 200, 11));  
011 - ne go ispolnuva kriteriumot za cena  
  
7. List<Item> newList = new ArrayList<>();  
newList.add(new Item("Item", 16, 510, 0));  
101 - ne e ispolnet kriteriumot za popust  
  
8. List<Item> newList = new ArrayList<>();  
newList.add(new Item("Item", 16, 500, 10));  
111 - gi ispolnuva site uslovi  
  
-Za da se ispolni Multiple Condition kriterumot za dadeniot uslov potrebni se najmalku 8 test slucaevi.  

