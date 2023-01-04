public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }

    public static void task1() {
        /**Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате. Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
         *
         */


        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        /** Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).

         Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.

         В качестве строки с исходными данными используйте строку fullName.

         Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"
         */


        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("Данные ФИО сотрудника для заполнения отчета —  " + fullName.toUpperCase());
    }

        public static void task3() {

            /** Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е».

             В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".

             Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».*/

            String fullName = "Иванов Семён Семёнович";
            String s2 = fullName.replace('ё', 'e');
            System.out.println("Данные ФИО сотрудника — "+ fullName.replace('ё', 'e'));


    }

}
