## テスト駆動開発勉強用

各 lesson ディレクトリに移動して下記で実行

コンパイル

```
javac -cp ../junit-platform-console-standalone-1.10.2.jar -d out $(find money -name \*.java)
```

実行

```
java -jar ../junit-platform-console-standalone-1.10.2.jar -cp out --scan-class-path
```
