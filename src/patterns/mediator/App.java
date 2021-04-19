package patterns.mediator;

//Посредник — это поведенческий паттерн проектирования, 
//который позволяет уменьшить связанность множества классов 
//между собой, благодаря перемещению этих связей в один класс-посредник
//
//Паттерн Посредник заставляет объекты общаться не напрямую друг с другом,
//а через отдельный объект-посредник, который знает, кому нужно перенаправить 
//тот или иной запрос. Благодаря этому, компоненты системы будут 
//зависеть только от посредника, а не от десятков других компонентов.
public class App {

    public static void main(String[] args) {

        Party party = new PartyImpl();
        var hobbit = new Hobbit();
        var wizard = new Wizard();
        var rogue = new Rogue();
        var hunter = new Hunter();

        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);

        hobbit.act(Action.ENEMY);
        wizard.act(Action.TALE);
        rogue.act(Action.GOLD);
        hunter.act(Action.HUNT);

    }
}
