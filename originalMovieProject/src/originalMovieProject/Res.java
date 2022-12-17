package originalMovieProject;

public class Res {
	int movieN;
	int movieNR;
	int movieT;
	int movieTr;
	int seatW;
	int seatH;

	String inf = "\n-----------------------------------------\n1.올빼미 | 2.블랙팬서 | 3.동감 | 4.데시벨\n-----------------------------------------\n선택>";

	String[][][] arr = {
			// 올빼미
			{
					// [0]
					{ "올빼미\n09:00\n1관" },
					// [0][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [0][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [0][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [0][3]
			},
			//
			{
					// [1]
					{ "올빼미\n12:00\n2관" },
					// [1][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [1][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [1][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [1][3]
			}, {
					// [2]
					{ "올빼미\n15:00\n3관" },
					// [2][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [2][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [2][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [2][3]
			},

			// 블랙팬서
			{
					// [3]
					{ "블랙팬서\n09:00\n4관" },
					// [3][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [3][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [3][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [3][3]
			}, {
					// [4]
					{ "블랙팬서\n12:00\n5관" },
					// [4][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [4][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [4][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [4][3]
			}, {
					// [5]
					{ "블랙팬서\n15:00\n6관" },
					// [5][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [5][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [5][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [5][3]
			},

			// 동감
			{
					// [6]
					{ "동감\n09:00\n7관" },
					// [6][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [6][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [6][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [6][3]
			}, {
					// [7]
					{ "동감\n12:00\n8관" },
					// [7][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [7][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [7][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [7][3]
			}, {
					// [8]
					{ "동감\n15:00\n9관" },
					// [8][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [8][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [8][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [8][3]
			},

			// 데시벨
			{
					// [9]
					{ "데시벨\n09:00\n10관" },
					// [9][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [9][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [9][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [9][3]
			}, {
					// [10]
					{ "데시벨\n12:00\n11관" },
					// [10][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [10][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [10][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [10][3]
			}, {
					// [11]
					{ "데시벨\n15:00\n12관" },
					// [11][0]
					{ "A열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [11][1]
					{ "B열", "□", "□", "□", "□", "□", "□", "□", "□" },
					// [11][2]
					{ "C열", "□", "□", "□", "□", "□", "□", "□", "□" }
			// [11][3]
			}, };

	// 선택 영화 안내 및 시간 안내
	int movieTime(String movieN) {
		if (movieN.equals("1")) {
			System.out.println("\n==============================================================\n");
			System.out.println("선택하신 영화는 \"올빼미\"입니다.");
			System.out.println("----------------------");
			System.out.println();
			for (int i = 0; i < 3; i++) {
				System.out.println((i + 1) + "." + arr[i][0][0]);
				System.out.println();
			}
			System.out.println("----------------------");
			System.out.print("시간을 선택하세요.>");
			movieNR = 1;
			return movieNR;
		} else if (movieN.equals("2")) {
			System.out.println("\n==============================================================\n");
			System.out.println("선택하신 영화는 \"블랙팬서\"입니다.");
			System.out.println("----------------------");
			System.out.println();
			for (int i = 3; i < 6; i++) {
				System.out.println((i - 2) + "." + arr[i][0][0]);
				System.out.println();
			}
			System.out.println("----------------------");
			System.out.print("시간을 선택하세요.>");
			movieNR = 2;
			return movieNR;
		} else if (movieN.equals("3")) {
			System.out.println("\n==============================================================\n");
			System.out.println("선택하신 영화는 \"동감\"입니다.");
			System.out.println("----------------------");
			System.out.println();
			for (int i = 6; i < 9; i++) {
				System.out.println((i - 5) + "." + arr[i][0][0]);
				System.out.println();
			}
			System.out.println("----------------------");
			System.out.print("시간을 선택하세요.>");
			movieNR = 3;
			return movieNR;
		} else if (movieN.equals("4")) {
			System.out.println("\n==============================================================\n");
			System.out.println("선택하신 영화는 \"데시벨\"입니다.");
			System.out.println("----------------------");
			System.out.println();
			for (int i = 9; i < 12; i++) {
				System.out.println((i - 8) + "." + arr[i][0][0]);
				System.out.println();
			}
			System.out.println("----------------------");
			System.out.print("시간을 선택하세요.>");
			movieNR = 4;
			return movieNR;
		}
		return movieNR;
	}

	// 좌석 시트인 010~039까지 좌석 안내
	void movieSeat(String movieT) {
		int movieTa = Integer.valueOf(movieT);
		if (movieNR == 1) {
			movieTr = (movieTa - 1) - (movieNR - 1);
			System.out.println("\n==============================================================\n");
			System.out.println('"' + arr[movieTr][0][0] + '"' + "을 선택하셨습니다.");
			System.out.println("-------------");
			for (int i = 1; i < 4; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(arr[movieTa - 1][i][j]);
				}
				System.out.println();
			}
			System.out.println("-------------");
		} else if (movieNR == 2) {
			movieTr = (movieTa + 2) - (movieNR - 2);
			System.out.println("\n==============================================================\n");
			System.out.println('"' + arr[movieTr][0][0] + '"' + "을 선택하셨습니다.");
			System.out.println("-------------");
			for (int i = 1; i < 4; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(arr[movieTa + 2][i][j]);
				}
				System.out.println();
			}
			System.out.println("-------------");
		} else if (movieNR == 3) {
			movieTr = (movieTa + 5) - (movieNR - 3);
			System.out.println("\n==============================================================\n");
			System.out.println('"' + arr[movieTr][0][0] + '"' + "을 선택하셨습니다.");
			System.out.println("-------------");
			for (int i = 1; i < 4; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(arr[movieTa + 5][i][j]);
				}
				System.out.println();
			}
			System.out.println("-------------");
		} else if (movieNR == 4) {
			movieTr = (movieTa + 8) - (movieNR - 4);
			System.out.println("\n==============================================================\n");
			System.out.println('"' + arr[movieTr][0][0] + '"' + "을 선택하셨습니다.");
			System.out.println("-------------");
			for (int i = 1; i < 4; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(arr[movieTa + 8][i][j]);
				}
				System.out.println();
			}
			System.out.println("-------------");
		}
	}
	// void seatWW(String seatWW) {
	// if((seatWW.equals("A")) || (seatWW.equals("a"))) {
	// seatW = 1;
	// }else if((seatWW.equals("B")) || (seatWW.equals("b"))) {
	// seatW = 2;
	// }else if((seatWW.equals("C")) || (seatWW.equals("c"))) {
	// seatW = 3;
	// }
	// }
	// void seatHH(int seatH) {
	// for (int i=1; i<4; i++) {
	// for (int j=0; j<9; j++) {
	// arr[movieTr][seatW][seatH] = "■";
	// }
	// for (i=1; i<4; i++) {
	// for (int j=0; j<9; j++) {
	// System.out.print(arr[movieTr][i][j]);
	// }System.out.println();
	// }
	// }
	// }

	// 입력받은 좌석값에 예약
	String[][][] seatNum(String seatW, int seatH) {

		if ((seatW.equals("A") || seatW.equals("a") || seatW.equals("1")) && (0 < seatH && seatH < 9)) {
			this.seatW = 1;
			this.seatH = seatH;
			if (arr[movieTr][this.seatW][this.seatH] == "■") {
				System.out.println("\n==============================================================\n");
				System.out.println("이미 예약된 자리입니다. 다른자리를 예약하세요.");
			} else {
				arr[movieTr][this.seatW][this.seatH] = "■";
				for (int i = 1; i < 4; i++) {
					for (i = 1; i < 4; i++) {
						for (int j = 0; j < 9; j++) {
							System.out.print(arr[movieTr][i][j]);
						}
						System.out.println();
					}
				}
				System.out.println("선택하신 좌석을 예약했습니다.");

			}
		} else if ((seatW.equals("B") || seatW.equals("b") || seatW.equals("2")) && (0 < seatH && seatH < 9)) {
			this.seatW = 2;
			this.seatH = seatH;
			if (arr[movieTr][this.seatW][this.seatH] == "■") {
				System.out.println("\n==============================================================\n");
				System.out.println("이미 예약된 자리입니다. 다른자리를 예약하세요.");
			} else {
				arr[movieTr][this.seatW][this.seatH] = "■";
				for (int i = 1; i < 4; i++) {
					for (i = 1; i < 4; i++) {
						for (int j = 0; j < 9; j++) {
							System.out.print(arr[movieTr][i][j]);
						}
						System.out.println();
					}
				}
				System.out.println("선택하신 좌석을 예약했습니다.");

			}
		} else if ((seatW.equals("C") || seatW.equals("c") || seatW.equals("3")) && (0 < seatH && seatH < 9)) {
			this.seatW = 3;
			this.seatH = seatH;
			if (arr[movieTr][this.seatW][this.seatH] == "■") {
				System.out.println("\n==============================================================\n");
				System.out.println("이미 예약된 자리입니다. 다른자리를 예약하세요.");
			} else {
				arr[movieTr][this.seatW][this.seatH] = "■";
				for (int i = 1; i < 4; i++) {
					for (i = 1; i < 4; i++) {
						for (int j = 0; j < 9; j++) {
							System.out.print(arr[movieTr][i][j]);
						}
						System.out.println();
					}
				}
				System.out.println("선택하신 좌석을 예약했습니다.");

			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		return arr;
	}

	void seatNumErase(String inputMoviename) {
		arr[Integer.parseInt(inputMoviename)][this.seatW][this.seatH] = "□";
		System.out.println("예매를 취소하였습니다.");
	}

}
