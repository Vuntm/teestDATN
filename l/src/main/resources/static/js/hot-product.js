function next() {
    let lists = document.querySelectorAll('.hot-product-item');
    document.getElementById('hot-product-slide').appendChild(lists[0]);
};
function prev() {
    let lists = document.querySelectorAll('.hot-product-item');
    document.getElementById('hot-product-slide').prepend(lists[lists.length - 1]);
}

let autoNext = setInterval(next, 4000);

document.getElementById('prev').onclick = function () {
   clearInterval(autoNext);
   prev();
   autoNext =setInterval(next, 3000);
};

document.getElementById('next').onclick = function () {
    clearInterval(autoNext);
    next();
    autoNext = setInterval(next, 3000);
}

function handleMouseEnter(element) {
  clearInterval(autoNext);
}

function handleMouseLeave(element) {
  autoNext = setInterval(next, 3000);
}








