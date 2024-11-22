document.getElementById('feeCalculatorForm').addEventListener('submit', function(e) {

    e.preventDefault();

    

    const courseCheckboxes = document.querySelectorAll('input[name="courses"]:checked');

    let total = 0;



    courseCheckboxes.forEach((checkbox) => {

        total += parseInt(checkbox.value);

    });



    let discount = 0;

    if (courseCheckboxes.length == 2) {

        discount = 0.05;

    } else if (courseCheckboxes.length == 3) {

        discount = 0.10;

    } else if (courseCheckboxes.length > 3) {

        discount = 0.15;

    }



    const discountedTotal = total - (total * discount);

    const vat = discountedTotal * 0.15;

    const finalTotal = discountedTotal + vat;



    document.getElementById('totalFee').textContent = finalTotal.toFixed(2);

});