import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int km, age, typeOfTrip;
        double totalPrice;

        // Getting the variables
        System.out.print("How many kilometers is the road : ");
        km = sc.nextInt();
        System.out.print("How old are you : ");
        age = sc.nextInt();
        System.out.print("One way (1) or return (2) : ");
        typeOfTrip = sc.nextInt();

        // Checking the information
        if ((km < 0) || (age < 0) || ((typeOfTrip != 1) && (typeOfTrip != 2))) {
            System.out.println("You entered wrong information!");
        } else {
            // Calculating the total price
            totalPrice = km * 0.1;

            if (age < 12) {
                totalPrice -= totalPrice * 0.5;
            } else if (age <= 24) {
                totalPrice -= totalPrice * 0.1;
            } else if (age >= 65) {
                totalPrice -= totalPrice * 0.3;
            }

            if (typeOfTrip == 2) {
                totalPrice -= totalPrice * 0.2;
                System.out.println("The price of the plane ticket is " + (2 * totalPrice) + " TL.");
            } else {
                System.out.println("The price of the plane ticket is " + totalPrice + " TL.");
            }
        }

    }
}
// Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve
// yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
// uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
//
//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
// Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.