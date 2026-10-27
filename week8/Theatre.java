package week8;

public class Theatre
{
		private int totalSeat, RowNum, SeatNum;
		public Theatre(int a, int b, int c){
			totalSeat=a;
			RowNum=b;
			SeatNum=c;
		}
		public boolean IsSuitable(String MovieName){
			//helper method: checks whether a given movie is the latest version

			return true;
		}

		public boolean play(int n, String Mname){
			/* returns true if a given movie can be played successfully。 
			Here the n represents the number of audience who buys the ticket. Mname is the movie’s name*/
			boolean p=false;

			if(IsSuitable(Mname)&&((double)n/totalSeat>=0.1)){
				p=true;
			}

			return p;
		}
}
