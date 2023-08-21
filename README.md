# CucumberPOMAutomation

Merhabalar,

Proje bir Cucumber/Gherkin dili ile web test otomasyon projesidir.

Projede kullandığım bağımlılıklar; cucumber-java, cucumber-testng, testng, selenium, extentreports (avenstack), jcommander..

Test senaryolarını features file içerisinde given and when then'ler ile yazıyoruz.  (src/test/java)

src/main/java/utilities içerisinde Driver testi ayağa kaldırma ve driver'ı kapatmayı sağlıyor(sadece chrome olarak ayarlı)

runners paketinde ise Smoke test, Regression test, Special test gibi Cucumber Runner özelliği kullanılarak belirli test senaryolarının koşumu sağlanıyor. 

xmlfiles paketinde projede kullanılan extentreport'un ayarları bulunuyor

pages paketindeki classlarda sayfalardaki elementlerin değerleri ve elementlere uyguladığımız fonksiyonlar bulunuyor.

tests paketinde Given and when then cümleciklerinin karşılığı olan stepler yer alıyor. bu stepleri birleştirip test senaryosu yazıyoruz.

-----------------------------------------------------------

Hi,

The project is a web test automation project with a Cucumber/Gherkin language.

The dependencies I used in the project; Cucumber-java, cucumber-testng, testng, selenium, extentreports (avenstack), jcommander..

We write test cases with given and when thens in the features file. (src/test/java)

Driver test in src/main/java/utilities enables to wake up and close the driver (only set to chrome)

In the runners package, certain test scenarios are run by using the Cucumber Runner feature such as Smoke test, Regression test, Special test.

The xmlfiles package contains the settings of the extentreport used in the project.

The classes in the pages package contain the values of the elements in the pages and the functions we apply to the elements.

The tests package includes the steps that correspond to the Given and when then clauses. We combine these steps and write a test scenario.
