# QuickQuest
# *Overview:*

*The application is envisioned as a platform for users to discover and engage with various offers and services applicable to their daily lives. Companies from diverse sectors such as security, home-service, carservice, workshops, dentistry, health, sports, beauty, and more, can utilize the platform to connect with potential customers.*

# User Interaction:

> [!IMPORTANT]
> The web application has two primary user types: questers and providers, each with distinct roles and functionalities.
    
  ### QUESTERS - Individual Users:
  - **Exploration:**
      Designed for personal use, individual users can explore a wide range of daily-life offers available on the platform.
  - **Selection Process:**
      Upon logging in, users can navigate through available options, receiving a tailored list of companies offering the desired services.
  - **Refinement Options:**
      Advanced filtering, including city and distance parameters, empowers users to fine-tune their search and select preferred companies.
  - **Request Submission:**
      Users can submit requests by completing a detailed form, specifying their needs and providing contact information, including the option to attach relevant photos.
  - **Processing and Communication:**
      Requests are processed to selected companies. Companies then independently reach out to users, who, in turn, can rate these companies on the platform, contributing to a dynamic rating filter dataset.
  - **Subscription Management:**
      Users can manage their subscription plans, with an annual fee of €x for individual users/customers.

  ### PROVIDERS - Company Users:
  - **Diverse Sectors:**
      Companies across various sectors, such as security, dentistry, health, sports, beauty, etc., can leverage the platform to connect with potential customers.
  - **Comprehensive Listing:**
      Access to a detailed listing of all companies and categories, offering key information such as location, email, and description.
  - **Subscription Management:**
      Companies can manage their subscription plans, with an annual fee of €x.

# Pages and Functionalities:
  ### Main Page:
  - Features a branches search bar, enabling users to discover relevant offers.
  - Returns a list of related results, allowing users to select their desired service and proceed to the request form.
  
  ### Profile Info Page:
  - Enables users to view and edit their profile information.
  - Provides an option to remove the user profile.
  
  ### Subscription Page:
  - Allows users to manage their subscription plans.
  
  ### Requests List Page:
  - Displays a list of both archived and current user requests.
  - Provides options to edit and delete requests.
  
  ### Request Editing:
  - Editing a request triggers the sending of a new template email to relevant companies.
  - Adding a new company results in a targeted email sent only to the newly added company.
  - If there are changes in the request, a new email is sent to the selected companies.
  - Deselecting a company sends a cancellation email to that specific company.
  
  ### Request Deletion:
  - Deleting a request initiates a cancellation email sent to the associated companies.
  
  ### Providers List Page:
  - Offers a comprehensive list of all companies and categories.
  - Provides access to detailed information about each company, including location, email, and description.

# Payment:
  Companies are charged €x/year, while individual users/customers pay €x/year.
  Includes a user page for accessing personal information and navigating to various sections of the application.

> [!NOTE]
> This documentation is an initial guide, and further development should consider security, database integration, and additional features as needed.
