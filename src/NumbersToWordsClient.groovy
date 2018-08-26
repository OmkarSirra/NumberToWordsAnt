
class NumbersToWordsClient {

	static main(args) {
		NumbersToWordsClient numToWordsClient = new NumbersToWordsClient();
		Scanner sc = new Scanner(System.in);
		println "Enter a Integer to show up in words";
		int num = sc.nextInt();
		def numberInWords = numToWordsClient.convertNmberToWords(num);
		println "numberInWords  : " + numberInWords;
	}
	
	def convertNmberToWords(int num)
	{
		if(num == 0)
		return "Zero";
		def wordInNum ="";
		int digit = num/100;
		if(digit >0)
		{
		wordInNum = wordInNum + " "+ digitToWord(digit);
		num = num%100;
		if(num%100 == 0)
		{
		wordInNum = wordInNum + " "+ "Hundred";
		return wordInNum;
		}

		}
		
		if(num>=90)
		{
		wordInNum = wordInNum + " "+ "Ninety";
		num = num%90;	
		} else
		if(num>=80)
		{
		wordInNum = wordInNum + " "+ "Eighty";
		num = num%80;
		} else
		if(num>=70)
		{
		wordInNum = wordInNum + " "+ "Seventy";
		num = num%70;
		} else
		if(num>=60)
		{
		wordInNum = wordInNum + " "+ "Sixty";
		num = num%60;
		} else
		if(num>=50)
		{
		wordInNum = wordInNum + " "+ "Fifty";
		num = num%50;
		} else
		if(num>=40)
		{
		wordInNum = wordInNum + " "+ "Forty";
		num = num%40;
		} else
		if(num>=30)
		{
		wordInNum = wordInNum + " "+ "Thirty";
		num = num%30;
		} else
		if(num>=20)
		{
		wordInNum = wordInNum + " "+ "Twenty";
		num = num%20;
		} 
		if(num>1 && num<=9)
			{
				wordInNum = wordInNum + " "+ digitToWord(num);
			}

			if(num>=19)
				{
				wordInNum = wordInNum + " "+ "Nineteen";
				} else
				if(num>=18)
				{
				wordInNum = wordInNum + " "+ "Eighteen";
				} else
				if(num>=17)
				{
				wordInNum = wordInNum + " "+ "Seventeen";
				} else
				if(num>=16)
				{
				wordInNum = wordInNum + " "+ "Sixteen";
				} else
				if(num>=15)
				{
				wordInNum = wordInNum + " "+ "Fifteen";
				num = num%50;
				} else
				if(num>=14)
				{
				wordInNum = wordInNum + " "+ "Fourteen";
				num = num%40;
				} else
				if(num>=13)
				{
				wordInNum = wordInNum + " "+ "Thirteen";
				num = num%30;
				} else
				if(num>=12)
				{
				wordInNum = wordInNum + " "+ "Twelve";
				num = num%12;
				} else
				if(num>=10)
				{
				wordInNum = wordInNum + " "+ "Ten";
				} 
				

					
		return wordInNum;

		
		
	}
	
	def digitToWord(int num)
	{
		switch(num)
		{
			case 9: return "Nine";
			case 8: return "Eight";
			case 7: return "Seven";
			case 6: return "Six";
			case 5: return "Five";
			case 4: return "Four";
			case 3: return "Three";
			case 2: return "Two";
			case 1: return "One";
		}
		return "Zero";
	}


}



