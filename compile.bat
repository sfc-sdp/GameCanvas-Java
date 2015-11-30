del gameCanvasUtil\Collision\*.class
del gameCanvasUtil\Resource\*.class
del gameCanvasUtil\*.class
del AppCanvas.class
del GameApp.class
del Game.class

javac gameCanvasUtil\Collision\*.java -encoding UTF-8
javac gameCanvasUtil\Resource\*.java -encoding UTF-8
javac gameCanvasUtil\*.java -encoding UTF-8
javac AppCanvas.java -encoding UTF-8
javac GameApp.java -encoding UTF-8
javac Game.java -encoding UTF-8

if not exist Game.class goto GAME_CLASS_ERROR
jar -cfmv GameApp.jar META-INF\MAINIFEST.MF *.class gameCanvasUtil\*.class res\* gameCanvasUtil\Collision\*.class  gameCanvasUtil\Resource\*.class
java -jar GameApp.jar
:GAME_CLASS_ERROR

pause;
