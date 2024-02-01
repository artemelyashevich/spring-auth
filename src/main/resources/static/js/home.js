const closeBtn = document.querySelector(".closeBtn")
const form = document.querySelector(".add-book")
const openBtn = document.querySelector(".header__add")

openBtn.addEventListener("click", () => {
    form.style.display = "block"
})

closeBtn.addEventListener("click", () => {
    form.style.display = "none"
})