const listImage = document.querySelector('.banner-slide');
const imgs = document.querySelectorAll('.banner-slide .banner-item');
const length = imgs.length;
let currentIndex = 0;

function nextBanner(){
    if (currentIndex == length - 1) {
        currentIndex = 0;
        listImage.style.transform = `translateX(0px)`;
        document.querySelector('.active').classList.remove('active');
        document.querySelector('.index-item-' + currentIndex).classList.add('active');
    } else {
        currentIndex++;
        let width = imgs[currentIndex].offsetWidth;
        listImage.style.transform = `translateX(${width * -1 * currentIndex}px)`;
        document.querySelector('.active').classList.remove('active');
        document.querySelector('.index-item-' + currentIndex).classList.add('active');
    }
}

let autoNextBanner = setInterval(nextBanner,4000);

const indexItems = document.querySelectorAll('.index-item');

indexItems.forEach((item, index) => {
    item.addEventListener('click', () => {
        clearInterval(autoNextBanner)
        const classNames = item.classList;
        const lastIndex = classNames[classNames.length - 1].split('-')[2];
        const currentIndex = parseInt(lastIndex);
        document.querySelector('.active').classList.remove('active');
        document.querySelector('.index-item-' + currentIndex).classList.add('active');
        let width = imgs[currentIndex].offsetWidth;
        listImage.style.transform = `translateX(${width * -1 * currentIndex}px)`;
        autoNextBanner = setInterval(nextBanner,4000);
    });
});