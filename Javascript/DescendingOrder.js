// Function to sort an array in descending order
function DescendingOrder(a, b) 
{
  	return b - a;
}

// Prompt the user for input
var input = prompt("Enter numbers separated by commas:");

if (input !== null) 
{
  	var inputArray = input.split(',').map(function(item) 
	{
    		return Number(item);
  	});

  	var sortedArray = inputArray.slice().sort(DescendingOrder);
  
  	console.log("Sorted Array (Descending):", sortedArray);
} 
else 
{
  	console.log("No input provided.");
}
