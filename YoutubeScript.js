let Threebar = document.querySelector('.Threebar')
let sidebar = document.querySelector('.sidebar')


Threebar.addEventListener("click",()=>
    {
        sidebar.classList.toggle('small-sidebar')
        document.querySelector('.main-container').classList.toggle('video-container-enlarge')
    }
)
