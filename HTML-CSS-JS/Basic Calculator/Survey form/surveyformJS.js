const countrySelect = document.getElementById("country");

        // Fetch country names from the REST Countries API
        fetch("https://restcountries.com/v3.1/all")
        .then(response => response.json())
        .then(data => {
        // Extract country names from the data
        const countryNames = data.map(country => country.name.common);
    
        // Sort the country names alphabetically
        countryNames.sort();
    
        // Populate the dropdown with sorted country names
        countryNames.forEach(countryName => {
            const option = document.createElement("option");
            option.value = countryName;
            option.textContent = countryName;
            countrySelect.appendChild(option);
    });
  })
  .catch(error => {
    console.error("Error fetching country data: " + error);
  });


  function submitfunction(){
    alert("Your form has been successfully submitted!!!");
}
function resetfunction(){
    inputs.forEach(input => input.value = '');
}