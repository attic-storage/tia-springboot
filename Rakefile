task :slides do
  Dir.chdir("slides") do
    sh "asciidoctor -T asciidoctor-backends/haml springboot.adoc"
    sh "open springboot.html"
  end
end

task :slidesDeps do
  sh "gem install bundler"
  sh "bundle install"
end


task :run do |t, args|
  src = ARGV.last
  Dir.chdir("sources") do
    sh "spring run #{src}.groovy -cp cp-#{src}/ --watch"
  end
end
