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



## Örnek 2 GPS
GPS (Global Positioning System) Türkçesi ile küresel konum belirleme sistemi, uydulardan alınan verilerle konum bilgisinin (enlem, boylam, yükseklik vs.) elde edildiği sistemdir. Yapılacak programda senaryo, konum verisinin (GPS cümleleri) uydudan GPS alıcısı adı verilen donanımlara oradan da bilgisayarda çalışılan programa iletilmesi şeklindedir. Bilgisayarda çalışan program konum verisini yorumlayarak konum bilgisi elde eder. Konum verisi ile anlatılan GPS cümleleridir. GPS cümlelerine 3 çeşit örnek aşağıda verilmiştir.

-	$GPGGA, N, 40, 30, E
-	$GPRMC, 41, N, E, 31
-	$GPGLL, N, E, 42, 32 

(Verilen GPS cümleleri Lab. Programında kullanılmak üzere basitleştirilmiştir, gerçekte çok daha fazla alan içermektedir.)

GPS cümlelerinin kuralları şunlardır:

-	GPS cümleleri her zaman $ karakteri ile başlar.
-	Cümle içerisinde alanlar virgül ile ayrılır.
-	$’dan ilk virgüle olan kısım başlıktır.
-	Başlık cümlenin türünü belirtir.
-	Örnekte verilen cümleler içerisinde 4 alan tanımlanmıştır.
-   Sayı ile verilen ilk alan enlem değeri
-	Sayı ile verilen ikinci alan boylam değeri
- Örnekte N ile belirtilen enlemin kuzey ve güney yarım küre oluşudur, örnekte kuzey yarımkürede bulunmaktadır (North)

-  	Örnekte E ile belirtilen boylamın doğu veya batı boylamı olduğudur, örnekte doğuda bulunmaktadır (East).

Bu bilgiler ışığında program yazmanız istenmektedir. Program yazarken;

-	GPSAlicisi
-	GPSProgrami (Bilgisayarda çalışan GPS programını temsilen sınıf)
-	Uydu
-	Test olmak üzere 4 adet sınıf kullanılacaktır.

## GPSAlicisi Sinifi
3 adet değişken alana sahiptir. Bunlar;

-	Sıcaklık (int türünden değişken) (private)
-	GPS alıcısının aktif olup olmadığını belirten değişken (boolean türünden) (public) 
-	GPS cümlesini depolayacak değişken (String türünden) (private)
Sınıfın bir adet nesne kurucusu bulunmaktadır; 
-	public GPSAlicisi ()

Nesne kurucusu ilk önce sicaklikOlc () metodunu çağırır. Elde edilen sıcaklık değeri 5 ile 40 arasında ise GPS alıcısının aktif olup olmadığını belirten değişken true, aksi durumda ise false yapılır.
Sınıfın;

-	private int sicaklikOlc ()
-	public void uydudanVeriAl (int cumleCesidi)
-	public String programaVeriGonder ()

olmak üzere üç adet metodu vardır.

**sicaklikOlc()** metodunda 1 ile 40 arasında rastgele bir tamsayı bulunur (Math.random kullanılarak) ve döndürülür.

**uydudanVeriAl()** cümle çeşidine göre GPS cümlesini depolayacak değişkene değer atanır. 3 çeşit cümle kullanılacaktır.

-	1 no’lu madde çeşidinde (cümle çeşidi değişkeni içerisinde 1 var ise) atanacak değer ;”$GPGGA,N, 40, 30, E” şeklindedir.

-	2 no’lu madde çeşidinde (cümle çeşidi değişkeni içerisinde 2 var ise) atanacak değer ; ”$GPRMC, 41, N, E, 31” şeklindedir.

-	3 no’lu madde çeşidinde (cümle çeşidi değişkeni içerisinde 3 var ise) atanacak değer ;”$GPGLL, N, E, 42, 32” şeklindedir.

Programa veriGonder metodunda GPS cümlesini depolayan dizgi türünden değişken döndürülür.

## Uydu Sınıfı
Sınıfın iki adet nesne kurucusu bulunmaktadır;

-	public uydu ()
-	public uydu (GPSAlicisi gA)

Parametresiz nesne kurucusunun GPSAlicisi sınıfı türünden bir giriş parametresi olmadığı için ekrana sadece uyarı mesajı basar.

Parametreli nesne kurucusunun GPSAlicisi sınıfı türünden bir giriş parametresi vardır. Ekrana GPS alıcısına bağlandığına dair bir uyarı mesajı yazdırır ayrıca uydu sınıfının veriTuruSec() metodu çağırılır. Bu metodun döndürdüğü tamsayı değer girdi olarak kullanılarak GPSAlicisi sınıfı türünden nesnenin uydudanVeriAl () metodu çağırılır. 

Sınıfın private int veriTuruSec () olmak üzere bir adet metodu vardır. 
veriTuruSec() metodunda 1 ile 3 arasında rastgele bir sayı değeri hesaplanır ve bu değer döndürülür.

## GPSProgrami Sınıfı
3 adet değişken alana sahiptir. Bunlar;

-	Konum verisi (GPS verisini depolayan değişken) (dizgi türünden) (private)
-	Enlem değeri (dizgi türünden) (private)
-	Boylan değeri (dizgi türünden) (private)
Sınıfın bir adet nesne kurucusu bulunmaktadır.
-	public GPSProgrami (GPSAlicisi gA)

Nesne kurucusu içerisinde GPSAlicisi sınıfı türünden nesnenin programaVeriGonder() metodu çağırılır. Bu metodun döndürdüğü dizgi türünden değişken kullanılarak GPSProgrami sınıfının konumBilgisi() metodu çağırılır. Sınıfın private void konumBilgisi (String konumVerisi) olmak üzere bir adet metodu vardır.

konumBilgisi () metodunda konumVerisi dizgisi taranarak enlem ve boylam değerleri dizginin içinden elde edilir. Ekrana GPS cümlesinin türü, enlem ve boylam değeri yazdırılır.

## Test Sınıfı 

**main()** metodunu içeren sınıftır.

main () metodu içerisinde öncelikle amaç GPSAlicisi sınıfı türünden nesne oluşturmaktır. Bir döngü içerisinde GPSAlicisi sınıfı türünden nesnenin boole alanı denetlenerek uygun sıcaklık aralığında GPSAlicisi sınıfı türünden nesne yaratması sağlanır.

İkinci olarak parametresiz nesne kurucusu kullanılarak Uydu sınıfı türünden nesne yaratılması sağlanır.

Üçüncü olarak parametreli nesne kurucusu kullanılarak Uydu sınıfı türünden nesne yaratılması sağlanır.

Son olarak GPSProgrami sınıfı türünden nesne yaratılır.
