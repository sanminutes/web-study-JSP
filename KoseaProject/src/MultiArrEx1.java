import java.util.Scanner;

public class MultiArrEx1 {
	public static void main(String[] args) {
		final int SIZE = 10;
		final int WIN_NUMBER = 3;
		int x = 0, y = 0;
		int AO = 0;
		int BO = 0;
		int cnt = 0;
		int R = 0;
		char[][] board = new char[SIZE][SIZE];
		int[][] shipBoard = new int[SIZE - 1][SIZE - 1];
		char[][] tmp = new char[SIZE - 1][SIZE - 1];

		for (int i = 0; i < shipBoard.length; i++) {
			for (int j = 0; j < shipBoard.length; j++) {
				shipBoard[i][j] = (int) (Math.random() * 2);
				if (shipBoard[i][j] == 1) {
					R++;
				}
			}
		}

		for (int i = 1; i < SIZE; i++)
			board[0][i] = board[i][0] = (char) (i + '0');

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("��ǥ�� �Է��ϼ���. (����� 00)> ");
			String input = sc.nextLine();
			if (input.length() == 2) {
				x = input.charAt(0) - '0';
				y = input.charAt(1) - '0';

				if (x == 0 && y == 0)
					break;
			}

			if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}

			board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';
			if (tmp[x][y] == 'X' || tmp[x][y] == 'O') {
				System.out.println("�ߺ��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			tmp[x][y] = board[x][y];
			cnt++;
			if (cnt % 2 != 0) {
				if (board[x][y] == 'O') {
					AO++;
				}
			} else {
				if (board[x][y] == 'O') {
					BO++;
				}
			}
			for (int i = 0; i < SIZE; i++)
				System.out.println(board[i]);

			if (cnt % 2 != 0) {
				System.out.println("���� [1Player]�� ���ʰ� �������ϴ�.");
			} else {
				System.out.println("���� [2Player]�� ���ʰ� �������ϴ�.");
			}
			System.out.printf("**1Player[%d], 2Player[%d]**\n", AO, BO);
			if (AO >= WIN_NUMBER) {
				System.out.println("** 1Player�� �̰���ϴ�!**");
			} else if (BO >= WIN_NUMBER) {
				System.out.println("** 2Player�� �̰���ϴ�!**");
			}
		}

	}
}
