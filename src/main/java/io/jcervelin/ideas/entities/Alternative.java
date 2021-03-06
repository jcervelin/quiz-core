package io.jcervelin.ideas.entities;

public class Alternative {
		
		private String text;
		boolean isCorrect;
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public boolean isCorrect() {
			return isCorrect;
		}
		public void setCorrect(boolean isCorrect) {
			//rightAnswer = isCorrect ? this : null;
			this.isCorrect = isCorrect;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((text == null) ? 0 : text.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Alternative other = (Alternative) obj;
			if (text == null) {
				if (other.text != null)
					return false;
			} else if (!text.equals(other.text))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Alternative [text=" + text + ", isCorrect=" + isCorrect + "]";
		}
		
	
	}