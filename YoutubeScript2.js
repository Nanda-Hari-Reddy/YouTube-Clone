let Threebar = document.querySelector('.Threebar')
let sidebar = document.querySelector('.sidebar')

Threebar.addEventListener("click",()=>
    {
        sidebar.classList.toggle('small-sidebar2')
    }
)
let video = document.getElementById("#play");

    // Play/pause the video when clicked
    video.addEventListener("click", function() {
        if (video.paused) {
            video.play();
        } else {
            video.pause();
        }
    });
