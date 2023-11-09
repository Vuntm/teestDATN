const searchContainer = document.getElementById('search-container');
const input = document.getElementById('search-input');

input.addEventListener('focus', function() {
    searchContainer.classList.add('focus');
});

input.addEventListener('blur', function() {
    searchContainer.classList.remove('focus');
});

searchContainer.addEventListener('click', function() {
    input.focus();
});