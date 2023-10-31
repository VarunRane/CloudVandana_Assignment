function ReverseWords(sentence) 
{
  	// Split the sentence into words
  	var words = sentence.split(' ');

  	// Reverse each word
  	var ReversedWords = words.map(function(word) 
	{
    		return word.split('').reverse().join('');
  	});

  	// Reconstruct the sentence
  	var ReversedSentence = ReversedWords.join(' ');

  	return ReversedSentence;
}

// Prompt the user for input
var inputSentence = prompt("Enter a sentence:");

if (inputSentence !== null) 
{
	var ReversedSentence = ReverseWords(inputSentence);
  	alert("Reversed Sentence: " + ReversedSentence);
} 
else 
{
  	alert("No input provided.");
}