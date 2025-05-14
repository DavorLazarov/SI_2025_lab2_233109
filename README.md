# SI_2025_lab2_233109
Davor Lazarov 233109

Ciklomatskata kompleksnost na kodot e 7 bidejki brojot na if uslovi e 6 + 1 sto se dodava.

1. checkCart(null, "2314567891092921")
kraen rezultat: "allItems list can't be null!" - prazna niza od elementi ili istata e netocno deklarirana

2. List<Item> newList = new ArrayList<>();
newList.add(new Item("", 1, 100, 0));
newList.add(new Item("2", 1, 200, 0));
newList.add(new Item("3", 1, 300, 0));
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
