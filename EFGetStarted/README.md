
A basic app implementation in .NET Core to performa data access using SQLIte database with Entity Framework Core


How project was created:

```
dotnet new console -o EFGetStarted
```

Install Entity Framework Core 
```
dotnet add package Microsoft.EntityFrameworkCore.Sqlite
dotnet add package Microsoft.EntityFrameworkCore.InMemory
```

Using migrations to create the database and
```
dotnet tool install --global dotnet-ef
dotnet add package Microsoft.EntityFrameworkCore.Design
dotnet ef migrations add InitialCreate
dotnet ef database update
```

Git Repo example:
- https://github.com/andreluizsecco/EFCore.Demo
