package ua.lviv.lgs.first;

	public class WrongInputException extends Exception {

		private String wrongInput;
		
		public WrongInputException(String wrongInput) {
			super(wrongInput);
			this.wrongInput = wrongInput;
		}

		public String getWrongInput() {			
			return wrongInput;
		}

	}
