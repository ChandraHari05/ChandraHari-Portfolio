document.getElementById("contactForm")
.addEventListener("submit", function(e){

    e.preventDefault();

    let data = {

        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        mobile: document.getElementById("mobile").value,
        subject: document.getElementById("subject").value,
        message: document.getElementById("message").value

    };


    fetch("http://localhost:8080/Contact",{

        method:"POST",

        headers:{
            "Content-Type":"application/json"
        },

        body:JSON.stringify(data)

    })
    .then(res=>res.json())
    .then(data=>{

        alert("Message Sent Successfully!");
        document.getElementById("contactForm").reset();

    });

});