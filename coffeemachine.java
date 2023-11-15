public class CoffeeMachine {

    private void grindCoffee() {
        System.out.println("Смилане на кафето");
    }

    private void makeCoffee() {
        System.out.println("Приготвяне на кафето");
    }

    private void pourIntoCup() {
        System.out.println("Наливане на кафето в чаша");
    }

    public void makeCappuccino() {
        grindCoffee();
        makeCoffee();
        System.out.println("Добавяне на пяна мляко за капучино");
        pourIntoCup();
        System.out.println("Капучино е готово");
    }

    public void makeEspresso() {
        grindCoffee();
        makeCoffee();
        pourIntoCup();
        System.out.println("Еспресо е готово");
    }

    public void makeAmericano() {
        grindCoffee();
        makeCoffee();
        System.out.println("Добавяне на гореща вода за американо");
        pourIntoCup();
        System.out.println("Американо е готово");
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        System.out.println("Приготвяне на капучино:");
        coffeeMachine.makeCappuccino();

        System.out.println("\nПриготвяне на еспресо:");
        coffeeMachine.makeEspresso();

        System.out.println("\nПриготвяне на американо:");
        coffeeMachine.makeAmericano();
    }
}
