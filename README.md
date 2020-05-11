# 20-Abgabe01-Stattmann-Zepf
###### Assignment 01: Test Automation with Junit

Student Team:
- [Lukas Zepf](https://github.com/LukasZepf)
- [Philipp Stattmann](https://github.com/OPS-Philipp)

### Project-description
With this project, we've got introduced into the universe of JUnit.

The main reason of this project is to separate different drinks and methods, which the drinks contain.
Our Project consists 2 classes, the superclass includes the information and methods of all drinks and the subclass includes the informatin and methods of liquor drinks.

### Implementation
We created a subclass which extends the superclass SimpleDrink and is called Beer. It contains a list of Liquids, and moreover it is able to check if the drink is a beer or not. In case of not being a beer, the NoBeerException gets throwen.

### Code Block of the Beer Constructor
<pre><code>public Beer(String name, Liquid l, Color color, List<Liquid> ingredients) throws NoBeerException {
        super(name, l);
        this.color = color;
        this.ingredients = ingredients;
        for (int i=0; i<this.ingredients.size(); i++) {
            if (ingredients.get(i).getIsBeer() == false) {
                throw new NoBeerException(ingredients.get(i));
            }
        }</code></pre>
