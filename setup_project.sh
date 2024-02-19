#!/bin/bash

# Script to guide contributors on getting started with the project and creating a new branch

echo "Welcome to the QuickQuest project! 🚀"

# Step 1: Clone the repository
echo "Step 1: Clone the repository"
git clone https://github.com/DjinaStevkovska/quickquest
cd quickquest  # Move into the project directory

# Step 2: Check available branches
echo -e "\nStep 2: Check available branches"
git branch -a

# Step 3: Switch to the default branch (main)
echo -e "\nStep 3: Switch to the default branch (main)"
git checkout main

# Step 4: Pull the latest changes
echo -e "\nStep 4: Pull the latest changes from the default branch"
git pull origin main

# Step 5: Create a new branch for your work (ex. create-models-and-repositories)
echo -e "\nStep 5: Create a new branch for your work"
read -e -p "Enter a unique name for your branch: " branch_name

# Sanitize the branch name by replacing spaces with underscores
branch_name=$(echo "$branch_name" | tr ' ' '_')

# Create and check out the new branch
git checkout -b $branch_name

# Verify that the new branch is created
git branch

# Step 6: Make changes and commit
echo -e "\nStep 6: Make changes to the code and commit your work"
# (Provide instructions on making changes and committing)

# Step 7: Push the new branch to GitHub
echo -e "\nStep 7: Push your new branch to GitHub"
git push origin $branch_name

echo -e "\nYou've successfully set up the project and created a new branch! Happy coding! 🎉"
