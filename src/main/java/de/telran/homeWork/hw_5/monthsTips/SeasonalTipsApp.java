package de.telran.homeWork.hw_5.monthsTips;

public class SeasonalTipsApp {
/*
Создайте класса Enum для хранения перечня месяцев в году.
Кроме константных значений, в нем должен также сохраняться русское наименование месяца.
Напишите метод, который будет рекомендовать вам режим питания, в зависимости от текущего месяца и сезона года.
*/
    public static void main(String[] args) {
        Months month = Months.JANUARY;


        System.out.print("Рекомендации по питанию на ");
        switch (month.ordinal()/3){
            case 0:
                System.out.println("зиму, месяц " + month.getMonth());
                System.out.println("Можно предпочесть теплые блюда, цельнозерновые продукты,а так же продукты богатые витамином D ");

                break;
            case 1:
                System.out.println("весну, месяц " + month.getMonth());
                System.out.println("Важно употреблять свежие фрукты и овощи, легкие белки, злаки и зерновые ");
               break;
            case 2:
                System.out.println("лето, месяц " + month.getMonth());
                System.out.println("Важно употреблять много воды, а так же соки, свежие продукты и легкие белки");

                break;
            case 3:
                System.out.println("осень, месяц " + month.getMonth());
                System.out.println("Время сезонных овощей, орехов и семян");

                break;

        }
    }
}
