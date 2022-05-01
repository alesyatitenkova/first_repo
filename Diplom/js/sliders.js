const slides = document.querySelectorAll('.i-need-2'),
    prev = document.querySelector('.ec-button-prev'),
    next = document.querySelector('.ec-button-next');
let slideIndax=1;
function showSlides(n){
    if(n>slides.length){
        slideIndax = 1;
    }
    if(n<1){
        slideIndax = slides.length;
    }
    slides.forEach(item => item.style.display = 'none');
    slides[slideIndax -1].style.display = 'block';    
}

showSlides(slideIndax);

function plusSlide(n){
    showSlides(slideIndax +=n);
}
next.addEventListener('click', ()=>{
    plusSlide(1);
})
prev.addEventListener('click', ()=>{
    plusSlide(-1);
})

const slides2 = document.querySelectorAll('.i-need'),
    prev2 = document.querySelector('.tc-button-prev'),
    next2 = document.querySelector('.tc-button-next'),
    current = document.querySelector('.testi-number');
let slideIndax2=1;
function showSlides2(n){
    if(n>slides2.length){
        slideIndax2 = 1;
    }
    if(n<1){
        slideIndax2 = slides2.length;
    }
    slides2.forEach(item => item.style.display = 'none');
    slides2[slideIndax2 -1].style.display = 'block';    
    if(slides2.length <10){
        current.textContent = `0${slideIndax2}.`;
    }else{
        current.textContent = `${slideIndax2}.`;
    }
}

showSlides2(slideIndax2);

function plusSlide2(n){
    showSlides2(slideIndax2 +=n);
}
next2.addEventListener('click', ()=>{
    plusSlide2(1);
})
prev2.addEventListener('click', ()=>{
    plusSlide2(-1);
})