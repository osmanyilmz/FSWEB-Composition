# Java Composition

### Proje Kurulumu

Projeyi önce forklayın daha sonra klonlayın ve Intellij kullanarak projeyi açın. 
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

Sınıf yazmaya doyduğunuz bir proje olması dileklerimle....

### Lamp
* org.example paketi altında model isminde bir paket oluşturunuz.
* org.example.model paketi altında Lamp isimli bir sınıf yazınız.
* Lamp sınıfı için 3 tane ```instance variable``` tanımlamalıyız. ```style``` tipi LampType isminde bir enum olmalı. ```battery``` tipi boolean olmalı. ```globRating``` tipi int olmalı. 
* org.example.model.enums paketi altında LampType isminde bir enum tanımlayınız. NORMAL,NEON ve LAVA değerlerini almalı.
* Lamp sınıfının tüm değişkenleri `private` olmalı. Lamp sınıfı için 3 değişkeninde eklenebileceği tek bir ```constructor``` olmalı.
* Lamp sınıfı için toplamda 4 metod yazmamız gerekiyor. ```turnOn``` herhangi bir değer dönmeyecek. Sadece 'Lamp is being turned on.' mesajının ekrana basacak.
* ```getStyle()``` style değişkenin değerini dönmeli. ```isBattery()``` battery değişkeninin değerini dönmeli. ```getGlobalRating()``` globalRating değişkeninin değerini dönmeli.

### Bed
* org.example.model paketi altında Bed isminde bir sınıf yazınız.
* Bed sınıfı için 5 tane ```instance variable``` tanımlamalıyız. style tipi String olmalı. ```pillows, height, sheets, quilt``` tipleri int olmalı. Hepsi private olmalı.
* Bed sınıfı için bir constructor yazmalıyız.
* Bed sınıfı için 5 metod yazacağız. ```make``` herhangi bir return değeri olmayacak. Sadece 'The bed is being made.' mesajını ekrana basacak.
* ```getPillows()``` pillows sayısını return etmeli. ```getHeight()``` height değerini return etmeli. ```getSheets()``` sheets sayısını return etmeli. ```getQuilts()``` quilts sayısını return etmeli.

### Wardrobe 
* org.example.model paketi altında Wardrobe isminde bir sınıf yazınız. 
* Wardrobe sınıfı için 3 adet ```instance variable``` tanımlayınız. ```int width, int height, double weight``` Hepsi private olmalı.
* Wardrobe sınıfı için constructor & getter metodlarını yazınız.
* Wardrobe sınıfı içerisinde ```add``` isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek. Sadece 'Wardrobe added into org.example.model.Bedroom.' mesajını ekrana basacak.

### org.example.model.Carpet
* org.example.model paketi altında org.example.model.Carpet isminde bir sınıf yazınız.
* org.example.model.Carpet sınıfı için 3 adet ```instance variable``` tanımlayınız. ```int width, int height, PaintColor color``` Hepsi private olmalı.
* org.example.model.enums paketi altında PaintColor isminde bir enum tanımlayınız. RED,GREEN ve WHITE değerlerini almalı.
* org.example.model.Carpet sınıfı için constructor & getter metodlarını yazınız.
* org.example.model.Carpet sınıfı içerisinde ```lying``` isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek. Sadece 'org.example.model.Carpet is lying on org.example.model.Bedroom floor.' mesajını ekrana basacak.

### org.example.model.Ceiling
* org.example.model paketi altında org.example.model.Ceiling isminde bir sınıf yazınız. org.example.model.Ceiling sınıfının 2 tane ```instance variable``` olmalı. ```height``` ve ```color```. height int tipinde olmalı color PaintColor isminde bir enum olmalı ve ikisi de private olmalı.
* org.example.model.Ceiling sınıfının bir ```constructor``` metodu olmalı. 2 değişkenine de değer atamalı.
* org.example.model.Ceiling sınıfının ```getHeight()``` adında bir metodu olmalı. height değerini dönmeli. ```getColor``` adında bir metodu olmalı ve paintedColor değerini dönmeli.
* org.example.model.Ceiling sınıfının ```create``` isimli bir metodu olmalı. Ekrana 'org.example.model.Ceiling has been built.' yazdırmalı.

### Wall
* org.example.model paketi altında Wall isminde bir sınıf yazınız. İçerisinde bir tane değişkeni olmalı ```direction``` String değerinde olmalı ve private olarak tanımlanmalı.
* Wall sınıfının bir ```constructor``` metodu olmalı ve tek değişkenine değer atamalı.
* Wall sınıfının iki metodu olmalı. ```getDirection``` direction değişkeninin değerini dönmeli. ```create``` metodu ekrana 'Wall has been built.' yazdırmalı.

### org.example.model.Bedroom 
* org.example.model.Bedroom isimli bir sınıf oluşturunuz.
* Bu sınıfın 10 tane ```instance variable``` değeri olmalı. ```name``` String tipinde. ```wall1 wall2 wall3 wall4``` Wall tipinde. ```ceiling``` org.example.model.Ceiling tipinde.
  ```bed``` Bed tipinde. ```lamp``` Lamp tipinde. ```wardrobe``` Wardrobe tipinde. ```carpet``` org.example.model.Carpet tipinde.
* Sınıfımızın ```constructor``` metodu tek olmalı ve 10 değişkeni de almalı. 
* getter metodlarını eklemelisiniz.

### Uygulamayı Test Etmek

 Bir adet org.example.model.Bedroom objesi oluşturun. İçerdiği sınıfların tüm değerlerine rahatlıkla erişebilmeli, tüm metodlarını çağırabilmelisin. 

### For Challengers
 * Room isminde bir sınıf tanımlasaydık. org.example.model.Bedroom ile ilişkisi nasıl olurdu ?
 * org.example.model.Bedroom'un hangi ```instance variable``` değerleri Room içerisine alınıp buradan yönetilebilirdi ?
 * Yapılan dizaynı bu bağlamda değiştiriniz.



