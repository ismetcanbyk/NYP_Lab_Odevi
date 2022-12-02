# "NYP_Lab_Odevi" 

## Örnek 1. Temel sınıf örneği 

Bir kafeteryada satılan yiyecekler ve kar oranları aşağıdaki gibi gruplandırılmışlardır.
``
### İndis	Yiyecek türü	Kar Oranı
#### 1	    Salata	        %30
#### 2	    Hamburger	    %25
#### 3	    Pizza	        %35
#### 4	    Tatlı	        %20


Her müşteri geldiğinde siparişi ve parasal tutarı bilgisayara girilmektedir. Buna göre günlük toplam satış ve karı, ısmarlanan tatlı sayısını ve salatalardan elde edilen ortalama karı çıktı olarak veren programı yazınız. “5” kodu girildiğinde program durmaktadır.
Program kodlanması esnasında 3 sınıf kullanılacaktır;


-	Kasa

-	Kasiyer

-	Deneme 

## Kasa sınıfı

5 adet değişken bulunması gerekmektedir. 

-	Toplam satış miktarı

-	Günlük kar

-	Salatalardan elde edilen kar

-	Tatlı sayısı

-	Salata sayısı

Sınıfın iki adet nesne kurucusu bulunmaktadır;

public Kasa()
-	public Kasa(String isim)

Her iki nesne kurucusu değişkenlere başlangıç değerini atar.
Ayrıca ekrana karşılama mesajı yazdırır (parametresiz olan çağırıldığında Hoş geldin, parametreli çağrılığında (Hoş geldin +isim)
Sınıfın;

-	public void hesapla (int secim, double fiyat)
-	private void topSatHesapla(double fiyat)
-	private void gunlukKrHesapla(int secim, double fiyat)
-	private void salataKari(double kar)
-	private void tatliSayisiArttir()
-	public void fisYazdir()

olmak üzere altı adet metodu vardır.

**hesapla()** metodunda yapılan iş sadece topSatHesapla() ve gunlukKrHesapla() metotlarının çağrılmasıdır.

**topHesapla()** metodunda toplam satış miktarı değeri, girdi olarak alınan fiyat değeri ile arttırılır.

**gunlukKrHesapla()** metodunda ilk sayfada verilen kriterlere göre kar hesaplanır ve günlük kar değerine eklenir. Ayrıca salata seçimi olduğu takdirde salataKari() metodu uygun parametre ile çağrılır. Tatlı seçimi yapıldığı takdirde tatlıSayisiArttir() metodu çağrılır.

**salataKari()** metodunda salata karı değeri, girdi olarak alınan kar değeri ile arttırılır.

**tatlıSayisiArttir()** metodunda tatlı sayısı değeri bir arttırılır.

**fisYazdir()** metodunda 

-	toplam satış miktarı
-	günlük kar miktarı
-	ortalama salata karı
-	tatlı sayısı

ekrana yazdırılır.

## Kasiyer sınıfı
Sınıf bir adet değişken alana sahiptir, bu alan Kasa sınıfı türünden bir nesne alanıdır. Sınıfın iki adet nesne kurucusu bulunmaktadır.
-	public Kasiyer()
-	public Kasiyer(String isim)

Parametreli nesne kurucusu Kasa sınıfı türünden bir nesne yaratır (Kasa sınıfının parametreli nesne kurucusu çağrılacak şekilde nesne yaratılır).
Sınıfın public void isVakti() metodu vardır.

**isVakti()** metodu bir döngü içerisinde kullanıcıdan yiyecek kodunu ve fiyatı alır. Döngüde her bir turda Kasa sınıfı türünden nesnenin hesapla metodu çağrılır. Döngüden çıkıldığında ise Kasa sınıfı türünden nesnenin fisYazdir() metodu çağrılarak hesaplanan değerlerin ekrana yazdırılması sağlanır.

## Deneme sınıfı
main() metodunu içeren sınıftır. Main() metodunda iki adet Kasiyer sınıfı türünden nesne yaratılır. İlki parametresiz nesne kurucusu kullanılarak çağrılmalıdır. İkincisi ise parametreli nesne kurucusu kullanılarak çağırılmalıdır (parametre olarak isim gönderilecektir). Ayrıca her iki nesnenin isVakti() metotları çağrılır.
