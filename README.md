## Adapterパターン

どんな時に使うのか？？

「すでに提供されているもの」と「必要なもの」のズレを埋めるもの。
すでに存在するクラスを再利用したい時に使える。Adapterパターンは、既存のクラスに変更は加えずに、
目的のインターフェイス(API)に手を加えようとするもの。


## Template Methodパターン

スーパークラスのテンプレートメソッド(サンプルでいうdisplayメソッド)でアルゴリズムが記述されているため、サブクラス側でアルゴリズムを書く必要がない。
スーパークラス型の変数に、サブクラスのインスタンスのどれを代入しても正しく動作する必要がある。
(リスコフの置換原則)

抽象クラスの段階で処理の流れを形作ることができる。

とはいえ、個人的なデメリットとして、抽象クラスをみないと、処理の流れがわかりづらいというところはあると思う。


## Builderパターン


## Strategyパターン


## Iteratorパターン

while文での記述では、インターフェイスに定義したhasNext()とnext()のみを使った実装となっている。
将来的に、例えばbookshelfで配列を使って本を管理することをやめて、別の方法で実装する形に変更したとしても
インターフェイスを利用する側の実装を変更する必要がない、ということになる。
(while文の記述をしている箇所は変更する必要がない。)


## Mediator

多数のオブジェクト間の調整をお粉分ければならないときに有効なパターン。
