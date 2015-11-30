//インポート
import gameCanvasUtil.*;

/** ゲームクラス。
 *
 * 学生が編集すべきソースコードです。
 */
public class Game extends GameBase
{
    /********* 初期化の手順はこちらに *********/
    public void initGame() {}

    /********* 物体の移動等の更新処理はこちらに *********/
    public void updateGame() {}

    /********* 画像の描画はこちらに *********/
    public void drawGame()
    {
        // 画面を白で塗りつぶします
        gc.clearScreen();

        // ここから、画像を表示する命令を記述していく
        gc.drawImage(0, 0, 0);
        gc.setColor(0, 0, 0);
        gc.drawString("この文字と青空の画像が見えていれば成功です", 60, 220);
    }

    /********* 終了時の処理はこちらに *********/
    public void finalGame() {}
}
