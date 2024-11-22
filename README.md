
Empowering The Nation Html Website

1. YouTube Video Link https://youtu.be/C3Kia0csShQ?si=GLLWhgFWIz2OAgGt
2. GitHub Website Link https://github.com/melleevinn/EmpoweringTheNationWebsite
3. GitHub Android Link https://github.com/melleevinn/Empowering-the-Nation-App



## Project Description
A platform designed to empower individuals by offering a range of online courses through a responsive website and an intuitive Android app.

## Features
- Course summaries and details
- Fee calculator with discounts
- Contact form integration
- SEO best practices for the website
- Mobile app with course details navigation

## Setup Instructions

### Website
1. Clone this repository.
2. Open the `Website` folder in any code editor (e.g., VS Code).
3. Open `index.html` in a browser.


## Code Log

1. Homepage

Created a responsive homepage with a hero section, navigation bar, and call-to-action buttons.

Code Added:html
<section class="hero">
    <h1>Empower Yourself Today</h1>
    <p>Join our courses to enhance your skills!</p>
    <a href="courses.html" class="cta-button">Explore Courses</a>
    <a href="contact.html" class="cta-button">Get Started</a>
</section>

2. Fee Calculator

Added a dynamic fee calculator with discount and VAT logic.

Code Added:javascript
document.getElementById('feeCalculatorForm').addEventListener('submit', function (e) {
    e.preventDefault();
    let total = 0;
    const discounts = calculateDiscount(total);
    const vat = total * 0.15;
    document.getElementById('finalFee').textContent = total + vat - discounts;
});

## Acknowledgements
- Used libraries: RecyclerView, Retrofit, etc.
- Inspiration from Coursera, Udemy.
