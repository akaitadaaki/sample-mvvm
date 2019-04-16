# sample-mvvm
Android ViewModel and DataBinding のサンプルです。  
* 画面はFragmentで作成  
* ただし、初期値の設定はActivityとする(ActivityとFragmentで共有されていることがわかるようにするため)  
* ＋ボタンをタップでベース値分、加算  
* ーボタンをタップでベース値分、減算  
* ベース値は変更可能  
* 計算は ViewModel で行う  
* ベース値の値取得や合計値表示はDataBindingで行う  
