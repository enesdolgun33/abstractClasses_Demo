# Abstract Classes Demo

Bu proje, Java'da **abstract (soyut) sınıfların** ve **miras (inheritance)** mekanizmasının nasıl kullanıldığını gösteren bir demo içermektedir. Proje, farklı kullanıcı türleri için hesaplama yapan bir oyun hesap makinesi örneği üzerinden abstract sınıfların avantajlarını ve kullanımını açıklar.

## Proje Yapısı

Proje, aşağıdaki sınıflardan oluşmaktadır:

1. **`GameCalculator` (Abstract Sınıf):**
   - `calculate()`: Soyut bir metot olup, alt sınıflar tarafından implemente edilmelidir.
   - `gameOver()`: Tüm alt sınıflar tarafından ortak kullanılan bir metot.

2. **`ManGameCalculator`:**
   - `GameCalculator` sınıfından türetilmiştir.
   - `calculate()` metodu, erkek oyuncular için özel hesaplama yapar.

3. **`WomanGameCalculator`:**
   - `GameCalculator` sınıfından türetilmiştir.
   - `calculate()` metodu, kadın oyuncular için özel hesaplama yapar.

4. **`KidsGameCalculator`:**
   - `GameCalculator` sınıfından türetilmiştir.
   - `calculate()` metodu, çocuk oyuncular için özel hesaplama yapar.

5. **`Main`:**
   - Programın başlangıç noktasıdır.
   - Farklı kullanıcı türleri için hesaplama örnekleri içerir.

## Nasıl Çalıştırılır?

Projeyi yerel makinenizde çalıştırmak için aşağıdaki adımları izleyin:

1. **Repoyu Klonlayın:**
   ```bash
   git clone https://github.com/enesdolgun33/abstractClasses_Demo.git
