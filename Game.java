//�C���|�[�g
import gameCanvasUtil.*;

/** �Q�[���N���X�B
 *
 * �w�����ҏW���ׂ��\�[�X�R�[�h�ł��B
 */
public class Game extends GameBase
{
    /********* �������̎菇�͂������ *********/
    public void initGame() {}

    /********* ���̂̈ړ����̍X�V�����͂������ *********/
    public void updateGame() {}

    /********* �摜�̕`��͂������ *********/
    public void drawGame()
    {
        // ��ʂ𔒂œh��Ԃ��܂�
        gc.clearScreen();

        // ��������A�摜��\�����閽�߂��L�q���Ă���
        gc.drawImage(0, 0, 0);
        gc.setColor(0, 0, 0);
        gc.drawString("���̕����Ɛ�̉摜�������Ă���ΐ����ł�", 60, 220);
    }

    /********* �I�����̏����͂������ *********/
    public void finalGame() {}
}
