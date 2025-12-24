// Show alert on button click
function showMessage() {
  alert("Welcome to my website!");
}

// Change background color
function changeColor() {
  document.body.style.backgroundColor = "#e6f2ff";
}

// Display current year in footer
document.addEventListener("DOMContentLoaded", function () {
  const year = new Date().getFullYear();
  document.getElementById("year").textContent = year;
});
