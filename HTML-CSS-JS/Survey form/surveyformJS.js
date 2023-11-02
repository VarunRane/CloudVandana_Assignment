const countrySelect = document.getElementById("country");

        
        fetch("https://restcountries.com/v3.1/all")
        .then(response => response.json())
        .then(data => {
        
        const countryNames = data.map(country => country.name.common);
    
       
        countryNames.sort();
    
        
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
