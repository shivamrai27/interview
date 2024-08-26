package Generics;

 class LeaernGenericcs {
    public static void main(String[] args) {
        // System.out.println("Hello");

        Dog <Float> d1 = new Dog<>(12.34f);
        Dog <Integer> d2 = new Dog<>(12);

        d1.print();
        d2.print();
    }
}

 class Dog <e> {
    e id;
    public Dog(e id) {
        this.id = id;
    }
    void print(){
        System.out.println(id);
    }
}
