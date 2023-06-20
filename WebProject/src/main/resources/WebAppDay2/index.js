/*Code is developed by Abhishek*/
$(document).ready(() => {
  let invalidFirstname = true;
  let invalidLastname = true;
  let invalidDateOfBirth = true;
  let invalidTotalWorkExperience = true;


  var gender = $("#gender");
  var firstName = $("#first-name");
  var lastName = $("#last-name");
  var fullName = $("#full-name");
  var nationality = $("#nationality");
  var dateOfBirth = $("#date-of-birth");
  var occupationType = $("#occupation-type");
  var totalWorkExperience = $("#total-work-experience");
  var organizationName = $("#organization-name");
  var houseNo = $("#house-no");
  var country = $("#country");
  var state = $("#state");
  var city = $("#city");


  var tenure = $("#tenure");
  var rateOfInterest = $("#rate-of-interest");
  var agreementDate = $("#agreement-date")
  var installmentDueDate = $("#installment-due-date");
  var productType = $("#product-type");
  var product = $("#product");


  var saveButton = $("#save-btn");


  var nextBtn = $("#next-btn");


  const moveToNextStageBtn = $("#move-to-next-stage-btn")


  firstName.keyup(() => {
    firstName.next(".error").text("");
    if (!/^[a-zA-Z]{3,}$/.test(firstName.val())) {
      firstName.next(".error").show();
      firstName
        .next(".error")
        .text(
          "First Name must be at least 3 chracters long and contains only alphabets"
        );
      invalidFirstname = true;
    } else {
      firstName.next(".error").hide();
      invalidFirstname = false;
    }
  });


  lastName.keyup(() => {
    lastName.next(".error").text("");
    if (!/^[a-zA-Z]{3,}$/.test(lastName.val())) {
      lastName.next(".error").show();
      lastName
        .next(".error")
        .text(
          "First Name must be at least 3 chracters long and contains only alphabets"
        );
      invalidLastname = true;
    } else {
      lastName.next(".error").hide();
      invalidLastname = false;
    }
  });

  dateOfBirth.keyup(() => {
    checkDate(dateOfBirth, invalidDateOfBirth)
  });

  totalWorkExperience.keyup(() => {
    totalWorkExperience.next(".error").text("");
    if (totalWorkExperience.val() < 0) {
      totalWorkExperience.next(".error").show();
      totalWorkExperience
        .next(".error")
        .text(
          "Total Work Experience must be positive number only and minimum value is 0"
        );
      invalidTotalWorkExperience = true;
    } else {
      totalWorkExperience.next(".error").hide();
      invalidTotalWorkExperience = false;
    }
  });


  const countryOptions = ["India", "USA", "UAE"];
  for (let i = 0; i < countryOptions.length; i++) {
    var option =
      "<option value='" +
      countryOptions[i] +
      "'>" +
      countryOptions[i] +
      "</option>";
    country.append(option);
  }


  const stateOptions = {
    India: ["Delhi", "Uttar Pradesh"],
    USA: ["New York", "California"],
    UAE: ["Dubai"],
  };


  const cityOptions = {
    Delhi: ["Delhi 1", "Delhi 2", "Delhi 3"],
    "Uttar Pradesh": ["Lucknow", "Kanpur", "Unnao", "Noida", "Agra"],
    "Ney York": ["New York 1", "New York 2", "New York 3"],
    California: ["Los Angeles", "San Fransisco"],
    Dubai: ["Dubai"],
  };


  country.change(() => {
    var selected = country.val();

    state.empty();
    city.empty();

    if (stateOptions.hasOwnProperty(selected)) {
      var states = stateOptions[selected];
      for (var i = 0; i < states.length; i++) {
        var option =
          "<option value='" + states[i] + "'>" + states[i] + "</option>";
        state.append(option);
      }
    }
  });

  state.change(() => {
    var selected = state.val();

    city.empty();

    if (cityOptions.hasOwnProperty(selected)) {
      var cities = cityOptions[selected];
      for (var i = 0; i < cities.length; i++) {
        var option =
          "<option value='" + cities[i] + "'>" + cities[i] + "</option>";
        city.append(option);
      }
    }
  });

  nextBtn.submit((e) => {
    e.preventDefault();
    if (
      invalidFirstname &&
      invalidLastname &&
      invalidDateOfBirth &&
      invalidTotalWorkExperience
    )
      alert("Error, Check credentials");
  });

  saveButton.submit((e) => {
    e.preventDefault();
    if (
      invalidFirstname &&
      invalidLastname &&
      invalidDateOfBirth &&
      invalidTotalWorkExperience
    )
      alert("Error, Check credentials");
  });

  let invalidTenure = true;
  tenure.keyup(() => {
    tenure.next(".error").text("");
    if (tenure.val() < 0 || tenure.val().length > 3) {
      tenure.next(".error").show();
      tenure
        .next(".error")
        .text("Tenure must be positive number only and max of 3 digits");
      invalidTenure = true;
    } else {
      tenure.next(".error").hide();
      invalidTenure = false;
    }
  });

  let invalidInstallmentDueDate = true;
  installmentDueDate.keyup(() => {
    checkDate(installmentDueDate, invalidInstallmentDueDate)
  });

  let invalidAgreementDate = false;
  //false because it is not a mandatory field, need not to check at form submission

  agreementDate.keyup(() => {
    checkDate(agreementDate, invalidAgreementDate)
  });

  //product types
  const productTypes = ["Auto Loan", "Consumer Vehicle Loan", "Education Loan"];
  for (let i = 0; i < productTypes.length; i++) {
    var option =
      "<option value='" +
      productTypes[i] +
      "'>" +
      productTypes[i] +
      "</option>";
    productType.append(option);
  }

  // products
  const products = {
    "Auto Loan": ["product 1", "Product 2"],
    "Consumer Vehicle Loan": ["Product 3"],
    "Education Loan": ["Product 4", "Product 5", "Product 6"],
  };

  productType.change(() => {
    var selected = productType.val();

    product.empty();

    if (products.hasOwnProperty(selected)) {
      var current = products[selected];
      for (var i = 0; i < current.length; i++) {
        var option =
          "<option value='" + current[i] + "'>" + current[i] + "</option>";
        product.append(option);
      }
    }
  });

  moveToNextStageBtn.click((e)=>{
    e.preventDefault();
    if(invalidTenure && invalidInstallmentDueDate && agreementDate) alert("Invalid Form Data");
  })

  const checkDate = (el, flag) =>{
    el.next(".error").text("");
    if (!/^\d{2}-\d{2}-\d{4}$/.test(el.val())) {
      el.next(".error").show();
      el
        .next(".error")
        .text("Date must be in format DD-MM-YYYY");
      flag = true;
    } else {
      el.next(".error").hide();
      var day = parseInt(el.val().substring(0, 2), 10);
      var month = parseInt(el.val().substring(3, 5), 10) - 1;
      var year = parseInt(el.val().substring(6, 10), 10);

      var date = new Date(year, month, day);

      //check if date is invalid
      if (
        date.getFullYear() !== year ||
        date.getMonth() !== month ||
        date.getDate() !== day
      ) {
        el.next(".error").show();
        el.next(".error").text("Invalid Date");
        flag = true;
      } else {
        el.next(".error").hide();
        flag = false;
      }
    }
  }
});
