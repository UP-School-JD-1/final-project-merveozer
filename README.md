#### Bazı Çıktı Örnekleri
------------
1) *Müşterilerden beklemek istemeyenler olabileceği gibi masa boşalıncaya kadar beklemeyi tercih edenler de olabilir. * 

Eğer müşterinin seçtiği masada kuyruk varsa müşterinin bekleyip beklememe durumuna göre bir işlem yapılır. 

-Müşteri beklemeyi tercih ederse -> Önce diğer masaların kuyruk uzunlukları seçilen masanın kuyruk uzunluğu ile karşılaştırılır. Kuyrukta bekleyen müşterisi daha az olan masa varsa müşteriye bu masa verilir. Ve daha sonraki işlemleri normal şekilde devam eder. 


<img width="600" alt="img3" src="https://user-images.githubusercontent.com/74708604/195444176-ccfa38df-607a-4c34-9e59-949ee1f51a0e.PNG">
[Beklemeyi tercih eden müşteriler...]

<img width="557" alt="img4" src="https://user-images.githubusercontent.com/74708604/195444198-5fc55f8c-93d0-49f3-b0b4-8cee196d6b04.PNG">
[Beklemeyi tercih eden Customer 49'un süreci.]
------------

-Müşteri beklemeyeceğini belirtirse müşterinin gitmeyi tercih ettiği yazılır ve müşteri restorandan ayrılır. Daha sonraki işlemlerin hiçbirini yapamaz.

<img width="703" alt="img1" src="https://user-images.githubusercontent.com/74708604/195444058-6f6865ce-0de8-41aa-bf47-709760d6b290.PNG">
[Beklemeyeceğini söyleyen müşteriler...]

<img width="189" alt="img2" src="https://user-images.githubusercontent.com/74708604/195444125-8a2a7180-b728-498c-8fd6-683d0aa8aebe.PNG">
[Beklemeyi tercih etmeyen Customer 35'in süreci.]
------------

2) Müşterinin seçtiği masadaki kuyruk sayısı 10'dan fazla ise o müşteri de restorana alınamaz. Bu durumda müşteriye bir duyuru yapılır. Ve bu duyuruyu alan müşteri de herhangi bir işlem yapamaz.

<img width="769" alt="img5" src="https://user-images.githubusercontent.com/74708604/195444268-381bd30e-c428-4744-926b-159ce16d0bd4.PNG">
[Kuyruktaki bekleyen sayısı 10'dan daha fazla olduğu için hizmet verilemeyen müşteriler...]

<img width="759" alt="img6" src="https://user-images.githubusercontent.com/74708604/195444291-3cc24c22-e7fa-4c00-8ac7-d4211851678b.PNG">
[Hizmet verilemeyen Customer 117'nin süreci.]
