<script>
document.addEventListener('DOMContentLoaded', function () {
    // Add an event listener to the submit button
    document.querySelector('.u-btn-submit').addEventListener('click', function (event) {
        event.preventDefault(); // Prevent the default form submission behavior

        // Capture form data
        const formData = {
            name: document.getElementById('name-7d5f').value,
            email: document.getElementById('email-7d5f').value,
            phone: document.getElementById('phone-41a3').value,
            street: document.getElementById('name-5ca1').value,
            city: document.getElementById('name-5ca1').value,
            zip: document.getElementById('name-5ca1').value,
            country: document.getElementById('country-5ca1').value,
            date: document.getElementById('date-d2ab').value,
            gender: document.querySelector('input[name="radiobutton"]:checked').value,
            password: document.getElementById('text-7331').value,
            confirmPassword: document.getElementById('text-13da').value,
        };

        // Generate HTML for the application form
        const applicationHTML = `
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Generated Application Form</title>
                <style>
                    /* Add your custom CSS styles here */
                    body {
                        font-family: 'Roboto', sans-serif;
                        font-size: 16px;
                        margin: 20px;
                    }
                    /* Add more styling as needed */
                </style>
            </head>
            <body>
                <h1>Generated Application Form</h1>
                <p><strong>Name:</strong> ${formData.name}</p>
                <p><strong>Email:</strong> ${formData.email}</p>
                <p><strong>Phone:</strong> ${formData.phone}</p>
                <p><strong>Street:</strong> ${formData.street}</p>
                <p><strong>City:</strong> ${formData.city}</p>
                <p><strong>Zip:</strong> ${formData.zip}</p>
                <p><strong>Country:</strong> ${formData.country}</p>
                <p><strong>Date:</strong> ${formData.date}</p>
                <p><strong>Gender:</strong> ${formData.gender}</p>
                <p><strong>Password:</strong> ${formData.password}</p>
                <p><strong>Confirm Password:</strong> ${formData.confirmPassword}</p>
            </body>
            </html>
        `;

        // Open a new window and write the generated HTML
        const newWindow = window.open();
        newWindow.document.write(applicationHTML);
    });
});
</script>
