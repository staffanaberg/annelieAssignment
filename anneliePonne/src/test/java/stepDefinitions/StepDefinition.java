package stepDefinitions;

public class StepDefinition {

		@Given("I want to write a step with name1 - I have logged in at Mailchimp")
		public void i_want_to_write_a_step_with_name1_i_have_logged_in_at_mailchimp() {
		    System.out.println("login");
		}

		@Given("I have entered i de olika fälten")
		public void i_have_entered_i_de_olika_fälten(String email) {
		   
		}
		@When("I check for the {int} in step")
		public void i_check_for_the_in_step(Integer int1) {
		   
		}
		@Then("I verify the success in step")
		public void i_verify_the_success_in_step() {
		    
		}



	
}
