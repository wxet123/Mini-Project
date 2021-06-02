const sign_in_btn = document.querySelector("#sign-in-btn");
const sign_up_btn = document.querySelector("#sign-up-btn");
const container = document.querySelector(".container");

sign_up_btn.addEventListener('click', () => {
    container.classList.add("sign-up-mode");
});

sign_in_btn.addEventListener('click', () => {
    container.classList.remove("sign-up-mode");
});


function showPassword(){
    var x = document.getElementById("myInput");
    var y = document.getElementById("hide1");
    var z = document.getElementById("hide2");
    var w = document.getElementById("myInput2");

    if(x.type === 'password', w.type ==='password'){
        x.type = "text";
        w.type = "text";
        y.style.display = "none";
        z.style.display = "block";
    }
    else{
        x.type = "password";
        w.type = "password";
        y.style.display = "block";
        z.style.display = "none";
    }


}



   
