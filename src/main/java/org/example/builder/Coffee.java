package org.example.builder;

public class Coffee {

    private String coffeeType;
    private boolean withMilk;
    private boolean sugar;

    private SizeEnum size;

    private Coffee(String coffeeType, boolean withMilk, boolean sugar, SizeEnum size) {
        this.coffeeType = coffeeType;
        this.withMilk = withMilk;
        this.sugar = sugar;
        this.size = size;
    }

    public static class CoffeeBuilder{
        private String coffeeType;
        private boolean withMilk;
        private boolean sugar;
        private SizeEnum size;


        public CoffeeBuilder setCoffeeType(String coffeeType) {
            this.coffeeType = coffeeType;
            return this;
        }

        public CoffeeBuilder setWithMilk(boolean withMilk) {
            this.withMilk = withMilk;
            return this;
        }

        public CoffeeBuilder setSugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public CoffeeBuilder setSize(SizeEnum size) {
            this.size = size;
            return this;
        }

        public Coffee build() {
            return new Coffee(this.coffeeType, this.withMilk, this.sugar, this.size);

        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coffee{");
        sb.append("coffeeType='").append(coffeeType).append('\'');
        sb.append(", withMilk=").append(withMilk);
        sb.append(", sugar=").append(sugar);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
